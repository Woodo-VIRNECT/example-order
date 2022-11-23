package dev.practice.order.interfaces.partner;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import dev.practice.order.domain.partner.PartnerCommand;

/**
 * Project        : order
 * DATE           : 2022/11/17
 * AUTHOR         : dnejdzlr2 (Woodo Lee)
 * EMAIL          : dnejdzlr2@virnect.com
 * DESCRIPTION    :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/17      dnejdzlr2          최초 생성
 */
@Mapper(
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR,
	unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface PartnerDtoMapper {

	// PartnerDto.RegisterRequest -> PartnerCommand 로 변환하겠다.
	PartnerCommand of(PartnerDto.RegisterRequest request);


}
