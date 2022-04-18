package com.example.demo.test;

import com.example.demo.webservicelocal.*;

import javax.xml.ws.BindingProvider;
import java.util.List;

public class WebserviceNet {

    public static void main(String[] args) {
        net2();
    }

    private static void net2() {
        NetHallContractWebService_Service netHallContractWebService_service = new NetHallContractWebService_Service();
        NetHallContractWebService service = netHallContractWebService_service.getNetHallContractWebServiceImplPort();
        basic(service);
        ObjectRestResponse insert = service.updateContractOfIntentionState(getNet());
        System.out.println(insert.getStatus() + insert.getMsg());
    }

    private static HtOrderStateVO getNet() {
        HtOrderStateVO htOrderStateVO = new HtOrderStateVO();
        htOrderStateVO.setContractOrderId("1111");
        String s = "{\"accurateName\":false,\"apiId\":\"V117646\",\"code\":\"rejected\",\"companyId\":\"4311\",\"enabled\":true,\"fullPath\":\"|V117643|V117646|\",\"id\":\"V117646\",\"isDeleted\":\"0\",\"level\":2,\"masterDataShowType\":\"LIST\",\"name\":\"已拒绝\",\"pid\":\"V117643\",\"sortNumber\":3,\"tenantId\":\"J3001686\"}";
        htOrderStateVO.setApprovalStatus(s);
        List<MeterNumberVO> meterNumberVOS = htOrderStateVO.getMeterNumberVOS();
        MeterNumberVO meterNumberVO = new MeterNumberVO();
        meterNumberVO.setMeterNumber("111");
        meterNumberVO.setStatus("3");
        meterNumberVOS.add(meterNumberVO);
        return htOrderStateVO;
    }

    /**
     * 添加basic认证
     */
    private static void basic(Object service) {
        BindingProvider bp = (BindingProvider) service;
        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "crm");
        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "7Cu%$0stomer");
    }
}
