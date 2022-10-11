public interface ITransaction {
    long getTransactionId();

    Integer getErrorCode();
    Integer setErrorCode(Integer value);
    int getState();
    int setState(int value);
    byte[] getEncryptKey();
    byte[] setEncryptKey(byte[] value);

}
