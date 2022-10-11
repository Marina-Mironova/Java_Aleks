public class Transaction implements ITransaction {
    private long transactionId;
    private Integer errorCode;
    private int state;
    private byte[] encryptKey;


    @Override
    public long getTransactionId() {
        return transactionId;
    }



    @Override
    public Integer getErrorCode() {
        return errorCode;
    }

    @Override
    public Integer setErrorCode(Integer value) {
        return null;
    }

    @Override
    public int getState() {
        return 0;
    }

    @Override
    public int setState(int value) {
        return 0;
    }

    @Override
    public byte[] getEncryptKey() {
        return new byte[0];
    }

    @Override
    public byte[] setEncryptKey(byte[] value) {
        return new byte[0];

    }

    @Override
    public String save() {
        System.out.println("save to DB");
        return null;
    }
}
