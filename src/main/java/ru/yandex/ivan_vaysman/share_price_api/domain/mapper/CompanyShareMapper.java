package ru.yandex.ivan_vaysman.share_price_api.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.yandex.ivan_vaysman.share_price_api.domain.dto.CompanyShareDTO;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;

import java.util.List;

@Mapper
public interface CompanyShareMapper {

    CompanyShareMapper INSTANCE = Mappers.getMapper(CompanyShareMapper.class);

    CompanyShare unmap(CompanyShareDTO dto);
    CompanyShareDTO map(CompanyShare companyShare);
    List<CompanyShare> unmapList(List<CompanyShareDTO> dto);
    List<CompanyShareDTO> mapList(List<CompanyShare> companyShares);
}
