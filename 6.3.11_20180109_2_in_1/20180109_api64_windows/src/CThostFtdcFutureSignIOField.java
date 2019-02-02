/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcFutureSignIOField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcFutureSignIOField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureSignIOField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcFutureSignIOField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttraderapiJNI.CThostFtdcFutureSignIOField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttraderapiJNI.CThostFtdcFutureSignIOField_TID_get(swigCPtr, this);
  }

  public CThostFtdcFutureSignIOField() {
    this(thosttraderapiJNI.new_CThostFtdcFutureSignIOField(), true);
  }

}