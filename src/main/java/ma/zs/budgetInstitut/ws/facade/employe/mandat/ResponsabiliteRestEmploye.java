package ma.zs.budgetInstitut.ws.facade.employe.mandat;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import ma.zs.budgetInstitut.dao.criteria.core.mandat.ResponsabiliteCriteria;
import ma.zs.budgetInstitut.service.facade.admin.mandat.ResponsabiliteAdminService;
import ma.zs.budgetInstitut.ws.converter.mandat.ResponsabiliteConverter;
import ma.zs.budgetInstitut.ws.dto.mandat.ResponsabiliteDto;
import ma.zs.budgetInstitut.zynerator.controller.AbstractController;
import ma.zs.budgetInstitut.zynerator.dto.FileTempDto;
import ma.zs.budgetInstitut.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/employe/responsabilite/")
public class ResponsabiliteRestEmploye extends AbstractController<Responsabilite, ResponsabiliteDto, ResponsabiliteCriteria, ResponsabiliteAdminService, ResponsabiliteConverter> {




    @Operation(summary = "Finds a list of all responsabilites")
    @GetMapping("")
    public ResponseEntity<List<ResponsabiliteDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all responsabilites")
    @GetMapping("optimized")
    public ResponseEntity<List<ResponsabiliteDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a responsabilite by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<ResponsabiliteDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new Responsabilite(libelle));
    }


    @Operation(summary = "Finds a responsabilite and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ResponsabiliteDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds responsabilites by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ResponsabiliteDto>> findByCriteria(@RequestBody ResponsabiliteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated responsabilites by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ResponsabiliteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports responsabilites by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ResponsabiliteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets responsabilite data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ResponsabiliteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public ResponsabiliteRestEmploye(ResponsabiliteAdminService service, ResponsabiliteConverter converter) {
        super(service, converter);
    }




}
