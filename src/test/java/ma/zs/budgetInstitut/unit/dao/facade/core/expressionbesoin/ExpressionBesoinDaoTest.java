package ma.zs.budgetInstitut.unit.dao.facade.core.expressionbesoin;

import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import ma.zs.budgetInstitut.dao.facade.core.expressionbesoin.ExpressionBesoinDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;

import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetInstitut.bean.core.commun.Employe ;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ExpressionBesoinDaoTest {

@Autowired
    private ExpressionBesoinDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        ExpressionBesoin entity = new ExpressionBesoin();
        entity.setId(id);
        underTest.save(entity);
        ExpressionBesoin loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        ExpressionBesoin entity = new ExpressionBesoin();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        ExpressionBesoin loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<ExpressionBesoin> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<ExpressionBesoin> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        ExpressionBesoin given = constructSample(1);
        ExpressionBesoin saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private ExpressionBesoin constructSample(int i) {
		ExpressionBesoin given = new ExpressionBesoin();
        given.setEmploye(new Employe(1L));
        given.setEntiteAdmin(new EntiteAdmin(1L));
        given.setDescription("description-"+i);
        given.setDateExpression(LocalDateTime.now());
        return given;
    }

}
