#Senaryo 5, Case 1 : Hesap Detaylarına Eişim

#Kullanıcı ana sayfada "Hesap Özeti" veya benzeri bir bağlantıyı bulur ve tıklar.
#Kullanıcı, "Hesap Özeti" ekranında aşağıdaki müşteri verilerini görüntüler:
#Hesap Numarası, Bakiye, Kullanılabilir Bakiye
#Kullanıcı, bir hesap numarasına tıklar.
#Kullanıcı, hesap detayları ekranında aşağıdaki bilgilere erişir:
#Hesap Numarası, Hesap Türü, Bakiye, Kullanılabilir Bakiye
#Kullanıcı, filtrelenmiş hesap aktiviteleri listesini görüntüler. Bu liste, tarih, işlem türü - işlem açıklaması, gönderme (debit (-)) veya alma (credit (+)) miktarı gibi bilgiler içermelidir.
#Kullanıcı, listede bulunan herhangi bir işleme tıklar.
#Kullanıcı, işlem detaylarını ("Transaction Details") görüntüler. İşlem detayları aşağıdaki bilgileri içermelidir:
#İşlem Kimliği(Transaction ID), Tarih, İşlem Açıklaması, Gönderme(debit) / Alma(credit) Miktarı #




Feature: Accounts Overview Functionality

  Background:
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed

Scenario:  Accounts Overview
  And  Click on the accountsOverview button


  Then should see customer data details
  And click on an account number
  And should see activity list
  And click on credit, debit and All button
  And should see "Transaction Details" as mentioned in customer data


