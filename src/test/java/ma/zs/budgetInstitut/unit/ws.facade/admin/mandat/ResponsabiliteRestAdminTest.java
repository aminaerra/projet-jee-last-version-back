package ma.zs.budgetInstitut.unit.ws.facade.admin.mandat;

import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import ma.zs.budgetInstitut.service.impl.admin.mandat.ResponsabiliteAdminServiceImpl;
import ma.zs.budgetInstitut.ws.facade.admin.mandat.ResponsabiliteRestAdmin;
import ma.zs.budgetInstitut.ws.converter.mandat.ResponsabiliteConverter;
import ma.zs.budgetInstitut.ws.dto.mandat.ResponsabiliteDto;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ResponsabiliteRestAdminTest {

    private MockMvc mockMvc;

    @Mock
    private ResponsabiliteAdminServiceImpl service;
    @Mock
    private ResponsabiliteConverter converter;

    @InjectMocks
    private ResponsabiliteRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllResponsabiliteTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<ResponsabiliteDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<ResponsabiliteDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveResponsabiliteTest() throws Exception {
        // Mock data
        ResponsabiliteDto requestDto = new ResponsabiliteDto();
        Responsabilite entity = new Responsabilite();
        Responsabilite saved = new Responsabilite();
        ResponsabiliteDto savedDto = new ResponsabiliteDto();

        // Mock the converter to return the responsabilite object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved responsabilite DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<ResponsabiliteDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        ResponsabiliteDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved responsabilite DTO
        assertEquals(savedDto.getLibelle(), responseBody.getLibelle());
        assertEquals(savedDto.getCode(), responseBody.getCode());
    }

}
