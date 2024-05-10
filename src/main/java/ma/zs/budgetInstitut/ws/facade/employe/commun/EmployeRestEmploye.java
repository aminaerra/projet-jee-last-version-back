package ma.zs.budgetInstitut.ws.facade.employe.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.budgetInstitut.bean.core.commun.Employe;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetInstitut.service.facade.admin.commun.EmployeAdminService;
import ma.zs.budgetInstitut.ws.converter.commun.EmployeConverter;
import ma.zs.budgetInstitut.ws.dto.commun.EmployeDto;
import ma.zs.budgetInstitut.zynerator.controller.AbstractController;
import ma.zs.budgetInstitut.zynerator.dto.FileTempDto;
import ma.zs.budgetInstitut.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/employe/employe/")
public class EmployeRestEmploye extends AbstractController<Employe, EmployeDto, EmployeCriteria, EmployeAdminService, EmployeConverter> {


    @Operation(summary = "Finds a list of all employes")
    @GetMapping("")
    public ResponseEntity<List<EmployeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @Operation(summary = "find by entiteAdmin id")
    @GetMapping("entiteAdmin/id/{id}")
    public List<EmployeDto> findByEntiteAdminId(@PathVariable Long id) {
        return findDtos(service.findByEntiteAdminId(id));
    }

    @Operation(summary = "delete by entiteAdmin id")
    @DeleteMapping("entiteAdmin/id/{id}")
    public int deleteByEntiteAdminId(@PathVariable Long id) {
        return service.deleteByEntiteAdminId(id);
    }

    @Operation(summary = "Finds a employe and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds employes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeDto>> findByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated employes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports employes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets employe data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    public EmployeRestEmploye(EmployeAdminService service, EmployeConverter converter) {
        super(service, converter);
    }


}
