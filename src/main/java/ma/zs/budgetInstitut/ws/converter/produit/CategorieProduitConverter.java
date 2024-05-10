package  ma.zs.budgetInstitut.ws.converter.produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;
import ma.zs.budgetInstitut.ws.dto.produit.CategorieProduitDto;

@Component
public class CategorieProduitConverter extends AbstractConverter<CategorieProduit, CategorieProduitDto> {


    public  CategorieProduitConverter() {
        super(CategorieProduit.class, CategorieProduitDto.class);
    }

    @Override
    public CategorieProduit toItem(CategorieProduitDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieProduit item = new CategorieProduit();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());



        return item;
        }
    }

    @Override
    public CategorieProduitDto toDto(CategorieProduit item) {
        if (item == null) {
            return null;
        } else {
            CategorieProduitDto dto = new CategorieProduitDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
