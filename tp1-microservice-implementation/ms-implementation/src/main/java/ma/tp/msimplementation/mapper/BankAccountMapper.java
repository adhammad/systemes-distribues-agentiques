package ma.tp.msimplementation.mapper;


import ma.tp.msimplementation.dtos.BankAccountRequestDTO;
import ma.tp.msimplementation.dtos.BankAccountResponseDTO;
import ma.tp.msimplementation.entities.BankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {


    BankAccountResponseDTO toBankAccountResponseDTO(BankAccount bankAccount);

    List<BankAccountResponseDTO> toBankAccountResponseDTOList(List<BankAccount> bankAccountList);


    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())")
    @Mapping(target = "createdAt", expression = "java(new java.util.Date())")
    BankAccount toBankAccount(BankAccountRequestDTO dto);
}
