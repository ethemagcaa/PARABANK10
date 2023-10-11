Kullanıcı, Para Bank web sitesine başarılı bir şekilde giriş yapar.
Kullanıcı, web sitesindeki menüden "Para Transferi" ("Transfer Funds") linkine tıklar.
Kullanıcı, fon transferi sayfasına yönlendirilir.
Kullanıcı, drop-down menüden birer gönderici ve alıcı hesabı seçer.
Kullanıcı, transfer edeceği {random} miktarı, "Tutar" ("Amount") alanına girer.
Kullanıcı, "Aktar" ("Transfer") butonuna tıklar.
Kullanıcı, onay mesajındaki gönderen ve alıcı hesap numaraları ile transfer tutarının bulunduğunu doğrular.
Kullanıcı, "Hesap Özeti" ("Accounts Overview") linkine tıklar.
Kullanıcı, alıcı hesap numarasına tıklar
Kullanıcı, ekrana gelen listedeki transfer tarihini,ve hesaba yatan para miktarını (Credit (+)) doğrular.

Kullanıcı, Senaryo 6, Case 1 'i tekrar eder.
Kullanıcı, ödeme detayları kısmındaki işlem kimliğini (Transaction ID) kaydeder.
Kullanıcı, leftnav'da yer alan işlemleri bulma ("Find Transactions") linkine tıklar.
Kullanıcı, "Find by Transaction ID" alanına rakamlardan oluşan işlem kimliğini (Transaction ID) girer.
Kullanıcı, "Find Transactions" butonuna tıklar.
Kullanıcı, açılan ekrandaki transfer (ya da ödeme) tutarının yaptığı transfer kadar olduğunu doğrular.





Feature: Transfer Funds Functionality

  Background:
    Given Navigate to ParaBank
    When  Enter username and password and click login button
    Then welcome message should be  displayed



  Scenario: Successful Money Transfer
    When the user clicks on the Transfer Funds link from the menu
    Then the user is redirected to the funds transfer page
    When the user selects a sender and a recipient account from the drop-down menus
    And the user enters the random amount  in the Amount field
    And the user clicks the Transfer button
    Then the user verifies the sender and recipient account numbers and the transfer amount in the confirmation message
    And the user clicks on the Accounts Overview link
    And the user clicks on the recipient account number
    Then the user verifies the transfer date and the amount credited in the displayed list
    And the user saves the transaction ID from the payment details section
    And the user clicks on the Find Transactions link in the left navigation
    And the user enters the numeric transaction ID in the Find by Transaction ID field
    And the user clicks the Find Transactions button
    Then the user verifies that the transfer amount on the opened screen matches the previously made transfer
