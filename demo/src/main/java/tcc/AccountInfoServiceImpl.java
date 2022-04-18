package tcc;


public class AccountInfoServiceImpl /*implements AccountInfoService*/ {
    /*@Autowired
    private AccountInfoDao accountInfoDao;

    @Transactional(rollbackFor = Exception.class)
    @Hmily(confirmMethod = "confirmMethod", cancelMethod = "cancelMethod")
    @Override
    public void updateAccountBalance(String accountNo, Double amount) {
        String transId = HmilyTransactionContextLocal.getInstance().get().getTransId();
        http:
        log.info("Bank2 Service Begin try ... " + transId);
    }

    @Transactional(rollbackFor = Exception.class)
    public void confirmMethod(String accountNo, Double amount) {
        String transId = HmilyTransactionContextLocal.getInstance().get().getTransId();
        http:
        log.info("Bank2 Service commit ..." + transId);
        // 幂等性校验，已经执行过了，什么也不用做
        if (accountInfoDao.isExistConfirm(transId) > 0) {
            http://log.info("Bank2 已经执行过confirm 。。无需再次confirm " + transId); return; }
            // 正式增加金额
            accountInfoDao.addAccountBalance(accountNo, amount);
            // 添加confirm日志
            accountInfoDao.addConfirm(transId); }
         }

    @Transactional(rollbackFor = Exception.class)
    public void cancelMethod (String accountNo, Double amount){
        String transId = HmilyTransactionContextLocal.getInstance().get().getTransId();
        http:
     log.info("Bank2 Service begin cancel ... " + transId);
   }*/



}