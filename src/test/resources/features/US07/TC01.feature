@gokce
  Feature: US-07


    Scenario: Kullanıcı “Horaires” seçeneğini yerleşim yeri girerek güzergah önerilerinin değiştiğini görebilir

      Given Web sitesine gidilir
      When Horaires seçeneği tiklanir
      And Bir yerleşim yeri girilir
      And Yerleşim yerini bulmak Icin search buttona tiklanir
      Then Hedefe giden hatlar doğru şekilde görüntülenir
      And  Ilk secenege tiklanir
      Then Sefer saatleri goruntulenir
