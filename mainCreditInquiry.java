public class mainCreditInquiry {
    
    public static void main (String[] args) throws Exception {
        createDataCredit conta = new createDataCredit();
        conta.openFile();
        conta.addRecords();
        conta.closefile();
        creditInquiry app = new creditInquiry();
        app.processRequest();
    }
}