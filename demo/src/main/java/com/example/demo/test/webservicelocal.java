package com.example.demo.test;




import com.example.demo.webservice.*;


import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class webservicelocal {

    public static void main(String[] args) {
        contract();
    }

    private static void customer2() {
        // 调用远程接口的类
        CustomerWebService_Service service_service = new CustomerWebService_Service();
        // 获取可执行的实现类
        CustomerWebService service = service_service.getCustomerWebServiceImplPort();
        basic(service);
        ObjectRestResponse insert = service.insert(getCustomer());
        //ObjectRestResponse insert = service.insertHighSeas(getGHCustomer());
        System.out.println(insert.getStatus() + insert.getMsg());
    }

    private static HighSeasReqVo getGHCustomer() {
        HighSeasReqVo highSeasReqVo = new HighSeasReqVo();
        CustomerVO customerVO = new CustomerVO();
        highSeasReqVo.setCustomerVO(customerVO);
        List<TNoVo> noVO = highSeasReqVo.getNoVO();
        TNoVo noVo = new TNoVo();
        noVo.setId("lz1");
        noVo.setVerificationSheet("lllllllll");
        noVO.add(noVo);
        return highSeasReqVo;
    }

    private static void contract() {
        // 调用远程接口的类
        ContractWebService_Service service_service = new ContractWebService_Service();
        // 获取可执行的实现类
        ContractWebService service = service_service.getContractWebServiceImplPort();

        basic(service);

        // 调用方法获取返回值
        //ObjectRestResponse insert = service.insert(getContract());
        ObjectRestResponse insert = service.insertDevEle(getContractDev());
        System.out.println(insert.getStatus() + insert.getMsg());
    }

    private static ContractDevEleRequestVO getContractDev() {
        ContractDevEleRequestVO contractDevEleRequestVO = new ContractDevEleRequestVO();
        List<DevEleVO> devEleVO = contractDevEleRequestVO.getDevEleVO();
        DevEleVO devEleVO1 = new DevEleVO();
        devEleVO1.setId("lz11111");
        devEleVO1.setUnitName("lz1111");
        devEleVO1.setUnitCode("lz1111");
        devEleVO1.setContracts("lz111");
        devEleVO.add(devEleVO1);
        contractDevEleRequestVO.setContractId("lz111");

        return contractDevEleRequestVO;
    }

    private static ContractRequestVO getContract() {
        ContractRequestVO contractRequestVO = new ContractRequestVO();
        SaleContractVO saleContractVO = new SaleContractVO();
        saleContractVO.setId("lz11122");
        saleContractVO.setCONTRACTTEMPDATA10("CONTRACTTEMPDATA10");
        contractRequestVO.setSaleContractVO(saleContractVO);


        List<EslVO> eslVO = contractRequestVO.getEslVO();
        EslVO esl = new EslVO();
        esl.setEle1(BigDecimal.ONE);
        esl.setId("lz1111");
        esl.setEle2(BigDecimal.TEN);
        esl.setEle3(BigDecimal.TEN);
        esl.setEle4(BigDecimal.TEN);
        esl.setEle5(BigDecimal.TEN);
        eslVO.add(esl);

        return contractRequestVO;
    }


    public static CustomerReqVo getCustomer(){
        CustomerReqVo customerReqVo = new CustomerReqVo();
        List<TContactsVo> contactsVos1 = customerReqVo.getContactsVos();
        List<THistoricalConsumptionVo> historicalConsumptionVos1 = customerReqVo.getHistoricalConsumptionVos();
        List<TNoVo> noVos1 = customerReqVo.getNoVos();
        List<TAgencyRelationshipVo> tAgencyRelationshipVos1 = customerReqVo.getTAgencyRelationshipVos();

        TCustomerVo customerVO = new TCustomerVo();
        customerVO.setId("lz111111");
        customerVO.setIndustryE("lz2222");
        //customerVO.setAdmitStatus("not-admitted");
        //customerVO.setFileUrl1("http://app.lab.chnenergy.com.cn/api/io/file/data/clickpaas/files/4311/0655d258076b4162aa5c09dc4f711660.xlsx?attname=%E5%90%88%E5%90%8C%E5%AF%BC%E5%85%A50906_%E5%AF%BC%E5%85%A5%E6%8A%A5%E5%91%8A+%282%29.xlsx");
        //customerVO.setVerificationSheet("http://app.lab.chnenergy.com.cn/api/io/file/data/clickpaas/files/4311/0655d258076b4162aa5c09dc4f711660.xlsx?attname=%E5%90%88%E5%90%8C%E5%AF%BC%E5%85%A50906_%E5%AF%BC%E5%85%A5%E6%8A%A5%E5%91%8A+%282%29.xlsx");
        customerVO.setIsRegistered("lz");
         List<TContactsVo> contactsVos = new ArrayList<>();
        TContactsVo tContactsVo = new TContactsVo();
        tContactsVo.setId("lz111111");
        tContactsVo.setBelongFormalCustomer("lz111111");
        contactsVos1.add(tContactsVo);


        List<THistoricalConsumptionVo> historicalConsumptionVos= new ArrayList<>();
        THistoricalConsumptionVo historicalConsumptionVo = new THistoricalConsumptionVo();
        historicalConsumptionVo.setId("lz111111");
        historicalConsumptionVo.setNormalCustomer("lz111111");
        historicalConsumptionVos1.add(historicalConsumptionVo);


         List<TNoVo> noVos= new ArrayList<>();
        TNoVo noVo = new TNoVo();
        noVo.setId("lz111111");
        noVo.setFormoal("lz111111");
        //noVo.setVerificationSheet("http://app.lab.chnenergy.com.cn/api/io/file/data/clickpaas/files/4311/0655d258076b4162aa5c09dc4f711660.xlsx?attname=%E5%90%88%E5%90%8C%E5%AF%BC%E5%85%A50906_%E5%AF%BC%E5%85%A5%E6%8A%A5%E5%91%8A+%282%29.xlsx");
        noVos1.add(noVo);



         List<TAgencyRelationshipVo> tAgencyRelationshipVos= new ArrayList<>();
         TAgencyRelationshipVo agencyRelationshipVo = new TAgencyRelationshipVo();
        agencyRelationshipVo.setId("lz111111");
        agencyRelationshipVo.setCustomerFomal("lz111111");
        tAgencyRelationshipVos1.add(agencyRelationshipVo);


        customerReqVo.setCustomerVo(customerVO);


        return customerReqVo;

    }

    /**
     * 添加basic认证
     */
    private static void basic(Object service) {
        BindingProvider bp = (BindingProvider) service;
        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "crm");
        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "7Cu%$0stomer");
        //生产
        //bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "7Cu%$0stomer#&s89fkl03");
    }
}
