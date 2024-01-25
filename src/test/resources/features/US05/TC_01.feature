@US_005
Feature: US_005z

  Background:
    Given Kullanıcı anasayfaya gider
    When kullanıcı aller retour seçenegini seçer

  Scenario:TC_001 "DE(Kalkış noktası) seçilmeden rota belirleme"
    And kullanıcı De seçenegine tıklar
    And kullanıcı De seçenegini boş bırakır
    And kullanıcı A seçenegine tıklar
    And kullanıcı A seçeneginde normandiya bolgesinden bir yerlesim alani seçer
    And kullanıcı Aller seçenegine tiklar ve geçerli bir tarih seçer
    And kullanici Retour seçenegine tiklar ve geçerli bir tarih seçer
    Then kullanıcı Rechercher butonunun olmadıgını gorur


  Scenario:TC_002 "A(Varış noktası) seçilmeden rota belirleme"
    And kullanıcı De seçeneginde normandiya bolgesinden bir yerlesim alani seçer
    And kullanıcı A seçenegine tıklar
    And kullanıcı A seçenegini boş bırakır
    And kullanıcı Aller seçenegine tiklar ve geçerli bir tarih seçer
    And kullanici Retour seçenegine tiklar ve geçerli bir tarih seçer
    Then kullanıcı Rechercher butonunun olmadıgını gorur


    Scenario: TC_003 "Aller(gidiş tarihi) geçerli olmayan bir tarih seçilerek rota belirleme"
         And kullanıcı De seçeneginde normandiya bolgesinden bir yerlesim alani seçer
         And kullanıcı A seçenegine tıklar
        And kullanıcı A seçeneginde normandiya bolgesinden bir yerlesim alani seçer
        Then kullanıcı Aller seçenegine tiklar ve geçerli olmayan bir tarih seçilemedigini gorur


      Scenario: TC_004 "Retour(dönüş tarihi) geçerli olmayan bir tarih seçilerek rota belirleme"
        And kullanıcı De seçeneginde normandiya bolgesinden bir yerlesim alani seçer
        And kullanıcı A seçenegine tıklar
        And kullanıcı A seçeneginde normandiya bolgesinden bir yerlesim alani seçer
        Then kullanıcı Retour seçenegine tiklar ve geçerli olmayan bir tarih seçilemedigini gorur


        Scenario: TC_005 "Kullanıcı “Aller-Retour” seçeneğinin ardından De, À, Départ seçeneklerini doldurunca otomatik çizilen rotada duraklar arasındaki tahmini varış süresini görebilmeli."
       And kullanıcı De seçeneginde normandiya bolgesinden bir yerlesim alani seçer
       And kullanıcı A seçenegine tıklar
       And kullanıcı A seçeneginde normandiya bolgesinden bir yerlesim alani seçer
      And  kullanıcı Aller seçenegine tiklar ve geçerli bir tarih seçer
       And kullanici Retour seçenegine tiklar ve geçerli bir tarih seçer
       And kullanıcı Rechercher butonuna tiklar
       And kullanıcı Transport en commun Toplu taşima araçlari altinda bulunan uygun olan seçenege tiklar
       And kullanıcı açılan ekranda voir les etapes seçenegine tiklar
       Then kullanıcı Mon trajet aller altında bulunan duraklar arasındaki tahmini varış süresini görüntüler



















