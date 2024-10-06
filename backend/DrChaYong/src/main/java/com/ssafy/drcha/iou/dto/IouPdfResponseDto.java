package com.ssafy.drcha.iou.dto;

import java.time.LocalDateTime;

import com.ssafy.drcha.iou.entity.Iou;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class IouPdfResponseDto {
	private Long iouId;
	private String creditorName;
	private String debtorName;
	private Long iouAmount;
	private LocalDateTime contractStartDate;
	private LocalDateTime contractEndDate;
	private Double interestRate;
	private Boolean borrowerAgreement;
	private Boolean lenderAgreement;
	private Long totalAmount;
	private String creditorPhoneNumber;
	private String debtorPhoneNumber;

	public static IouPdfResponseDto from(Iou iou) {
		return new IouPdfResponseDto(
			iou.getIouId(),
			iou.getCreditor().getUsername(),
			iou.getDebtor().getUsername(),
			iou.getIouAmount(),
			iou.getContractStartDate(),
			iou.getContractEndDate(),
			iou.getInterestRate(),
			iou.getBorrowerAgreement(),
			iou.getLenderAgreement(),
			calculateTotalAmount(iou.getIouAmount(), iou.getInterestRate(), 12),
			iou.getCreditor().getPhoneNumber(),
			iou.getDebtor().getPhoneNumber()
		);
	}

	/**
	 * 원리금을 계산하는 메서드 (단리 방식)
	 *
	 * @param iouAmount 원금
	 * @param interestRate 이자율 (예: 0.055는 5.5% 이자율을 의미)
	 * @param months 기간 (개월 단위, 예: 1개월)
	 * @return 원금과 이자를 합한 금액
	 */
	private static Long calculateTotalAmount(Long iouAmount, Double interestRate, int months) {
		if (iouAmount == null || interestRate == null || months <= 0) {
			return null;
		}
		double period = months / 12.0;  // 기간을 년 단위로 환산 (1개월은 1/12년)
		double interest = iouAmount * interestRate * period;  // 단리 이자 계산
		return Math.round(iouAmount + interest);  // 원리금 합산 후 반올림하여 반환
	}

}