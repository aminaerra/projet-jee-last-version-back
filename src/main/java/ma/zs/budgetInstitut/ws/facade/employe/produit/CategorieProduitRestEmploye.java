package ma.zs.budgetInstitut.ws.facade.employe.produit;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;
import ma.zs.budgetInstitut.dao.criteria.core.produit.CategorieProduitCriteria;
import ma.zs.budgetInstitut.service.facade.admin.produit.CategorieProduitAdminService;
import ma.zs.budgetInstitut.ws.converter.produit.CategorieProduitConverter;
import ma.zs.budgetInstitut.ws.dto.produit.CategorieProduitDto;
import ma.zs.budgetInstitut.zynerator.controller.AbstractController;
import ma.zs.budgetInstitut.zynerator.dto.FileTempDto;
import ma.zs.budgetInstitut.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/employe/categorieProduit/")
public class CategorieProduitRestEmploye extends AbstractController<CategorieProduit, CategorieProduitDto, CategorieProduitCriteria, CategorieProduitAdminService, CategorieProduitConverter> {



    @Operation(summary = "upload one categorieProduit")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple categorieProduits")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all categorieProduits")
    @GetMapping("")
    public ResponseEntity<List<CategorieProduitDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all categorieProduits")
    @GetMapping("optimized")
    public ResponseEntity<List<CategorieProduitDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a categorieProduit by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<CategorieProduitDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new CategorieProduit(libelle));
    }

    @Operation(summary = "Saves the specified  categorieProduit")
    @PostMapping("")
    public ResponseEntity<CategorieProduitDto> save(@RequestBody CategorieProduitDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  categorieProduit")
    @PutMapping("")
    public ResponseEntity<CategorieProduitDto> update(@RequestBody CategorieProduitDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of categorieProduit")
    @PostMapping("multiple")
    public ResponseEntity<List<CategorieProduitDto>> delete(@RequestBody List<CategorieProduitDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified categorieProduit")
    @DeleteMapping("")
    public ResponseEntity<CategorieProduitDto> delete(@RequestBody CategorieProduitDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified categorieProduit")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple categorieProduits by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a categorieProduit and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CategorieProduitDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds categorieProduits by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategorieProduitDto>> findByCriteria(@RequestBody CategorieProduitCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated categorieProduits by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategorieProduitCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports categorieProduits by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategorieProduitCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets categorieProduit data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategorieProduitCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public CategorieProduitRestEmploye(CategorieProduitAdminService service, CategorieProduitConverter converter) {
        super(service, converter);
    }




}
