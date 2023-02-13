package com.nt.controller;
import com.nt.service.CustomerMgmtServiceImpl;
import com.nt.dto.CustomerDTO;
import com.nt.vo.CustomerVO;

public class MainController {
	private CustomerMgmtServiceImpl service;

	public MainController(CustomerMgmtServiceImpl service) {
		this.service=service;
	}
	public String processEmployee(CustomerVO vo) throws Exception {
		// convert vo to dto
		CustomerDTO dto = null;

		String Name = vo.getName();
		String Items = vo.getItems();
		double Discount = Double.parseDouble(vo.getDiscount());
		double MarketPrice = Double.parseDouble(vo.getMarketPrice());
		//double BillAmt = Double.parseDouble(vo.getBillAmt());
		dto = new 	CustomerDTO();

		dto.setName(Name);

		dto.setItems(Items);
		dto.setMarketPrice(MarketPrice);
		dto.setDiscount(Discount);
		//dto.setBillAmt(BillAmt);
		// call the service method
		String status = service.calBillAmt(dto);
		return status;
	}
}
