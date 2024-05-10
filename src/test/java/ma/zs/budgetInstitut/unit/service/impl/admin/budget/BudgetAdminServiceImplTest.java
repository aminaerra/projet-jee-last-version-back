package ma.zs.budgetInstitut.unit.service.impl.admin.budget;

import ma.zs.budgetInstitut.bean.core.budget.Budget;
import ma.zs.budgetInstitut.dao.facade.core.budget.BudgetDao;
import ma.zs.budgetInstitut.service.impl.admin.budget.BudgetAdminServiceImpl;

import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetInstitut.bean.core.budget.Budget ;
import ma.zs.budgetInstitut.bean.core.budget.BudgetEntiteAdmin ;
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
class BudgetAdminServiceImplTest {

    @Mock
    private BudgetDao repository;
    private AutoCloseable autoCloseable;
    private BudgetAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new BudgetAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllBudget() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveBudget() {
        // Given
        Budget toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteBudget() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetBudgetById() {
        // Given
        Long idToRetrieve = 1L; // Example Budget ID to retrieve
        Budget expected = new Budget(); // You need to replace Budget with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Budget result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Budget constructSample(int i) {
		Budget given = new Budget();
        given.setDateBudget(LocalDateTime.now());
        given.setMontant(BigDecimal.TEN);
        given.setMontantInvestissement(BigDecimal.TEN);
        given.setMontantFonction(BigDecimal.TEN);
        List<BudgetEntiteAdmin> budgetEntiteAdmins = IntStream.rangeClosed(1, 3)
                                             .mapToObj(id -> {
                                                BudgetEntiteAdmin element = new BudgetEntiteAdmin();
                                                element.setId((long)id);
                                                element.setEntiteAdmin(new EntiteAdmin(Long.valueOf(1)));
                                                element.setMontantEntite(new BigDecimal(2*10));
                                                element.setMontantInvEntite(new BigDecimal(3*10));
                                                element.setMontantFctEntite(new BigDecimal(4*10));
                                                element.setBudget(new Budget(Long.valueOf(5)));
                                                return element;
                                             })
                                             .collect(Collectors.toList());
        given.setBudgetEntiteAdmins(budgetEntiteAdmins);
        return given;
    }

}
