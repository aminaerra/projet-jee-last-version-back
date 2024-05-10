package ma.zs.budgetInstitut.unit.service.impl.admin.expressionbesoin;

import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import ma.zs.budgetInstitut.dao.facade.core.expressionbesoin.ExpressionBesoinDao;
import ma.zs.budgetInstitut.service.impl.admin.expressionbesoin.ExpressionBesoinAdminServiceImpl;

import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoinDetail ;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin ;
import ma.zs.budgetInstitut.bean.core.commun.Employe ;
import ma.zs.budgetInstitut.bean.core.produit.Produit ;
import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class ExpressionBesoinAdminServiceImplTest {

    @Mock
    private ExpressionBesoinDao repository;
    private AutoCloseable autoCloseable;
    private ExpressionBesoinAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new ExpressionBesoinAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllExpressionBesoin() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveExpressionBesoin() {
        // Given
        ExpressionBesoin toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteExpressionBesoin() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetExpressionBesoinById() {
        // Given
        Long idToRetrieve = 1L; // Example ExpressionBesoin ID to retrieve
        ExpressionBesoin expected = new ExpressionBesoin(); // You need to replace ExpressionBesoin with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        ExpressionBesoin result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private ExpressionBesoin constructSample(int i) {
		ExpressionBesoin given = new ExpressionBesoin();
        given.setEmploye(new Employe(1L));
        given.setEntiteAdmin(new EntiteAdmin(1L));
        given.setDescription("description-"+i);
        given.setDateExpression(LocalDateTime.now());
        List<ExpressionBesoinDetail> expressionBesoinDetails = IntStream.rangeClosed(1, 3)
                                             .mapToObj(id -> {
                                                ExpressionBesoinDetail element = new ExpressionBesoinDetail();
                                                element.setId((long)id);
                                                element.setQteDemandee(new BigDecimal(1*10));
                                                element.setQteAccordee(new BigDecimal(2*10));
                                                element.setQteLivre(new BigDecimal(3*10));
                                                element.setExpressionBesoin(new ExpressionBesoin(Long.valueOf(4)));
                                                element.setProduit(new Produit(Long.valueOf(5)));
                                                return element;
                                             })
                                             .collect(Collectors.toList());
        given.setExpressionBesoinDetails(expressionBesoinDetails);
        return given;
    }

}
