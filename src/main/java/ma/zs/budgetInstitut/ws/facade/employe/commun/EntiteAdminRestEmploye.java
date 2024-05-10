package ma.zs.budgetInstitut.ws.facade.employe.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EntiteAdminCriteria;
import ma.zs.budgetInstitut.service.facade.admin.commun.EntiteAdminAdminService;
import ma.zs.budgetInstitut.ws.converter.commun.EntiteAdminConverter;
import ma.zs.budgetInstitut.ws.dto.commun.EntiteAdminDto;
import ma.zs.budgetInstitut.zynerator.controller.AbstractController;
import ma.zs.budgetInstitut.zynerator.dto.FileTempDto;
import ma.zs.budgetInstitut.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/employe/entiteAdmin/")
public class EntiteAdminRestEmploye extends AbstractController<EntiteAdmin, EntiteAdminDto, EntiteAdminCriteria, EntiteAdminAdminService, EntiteAdminConverter> {




    @Operation(summary = "Finds a list of all entiteAdmins")
    @GetMapping("")
    public ResponseEntity<List<EntiteAdminDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all entiteAdmins")
    @GetMapping("optimized")
    public ResponseEntity<List<EntiteAdminDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a entiteAdmin by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<EntiteAdminDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new EntiteAdmin(libelle));
    }



    @Operation(summary = "find by chef id")
    @GetMapping("chef/id/{id}")
    public List<EntiteAdminDto> findByChefId(@PathVariable Long id){
        return findDtos(service.findByChefId(id));
    }

    @Operation(summary = "Finds a entiteAdmin and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EntiteAdminDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds entiteAdmins by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EntiteAdminDto>> findByCriteria(@RequestBody EntiteAdminCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated entiteAdmins by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EntiteAdminCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports entiteAdmins by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EntiteAdminCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets entiteAdmin data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EntiteAdminCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public EntiteAdminRestEmploye(EntiteAdminAdminService service, EntiteAdminConverter converter) {
        super(service, converter);
    }




}
