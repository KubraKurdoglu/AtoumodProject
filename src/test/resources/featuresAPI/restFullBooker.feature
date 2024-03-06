@RestFull
Feature: REstFullApi End To End Test

  #Scenario: getAuthentication
   # Given getAuthentication "https://restful-booker.herokuapp.com/auth"
    #And assert status code 200


  Scenario: Create Booking
    Given create Booking "https://restful-booker.herokuapp.com/booking"
    #And assert status code 200

  Scenario: Update Booking
    Given update Booking "https://restful-booker.herokuapp.com/booking"
    #And assert status code 200

  Scenario: Partial Update Booking
    Given partial update Booking "https://restful-booker.herokuapp.com/booking"
    #And assert status code 200

  Scenario: Delete Booking
    Given delete Booking "https://restful-booker.herokuapp.com/booking"
    And assert status code 200