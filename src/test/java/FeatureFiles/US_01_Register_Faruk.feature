Feature: Register Functionality

  Scenario: Register with user information

     Given Navigate to CleverPPC

    When Click on the element in DialogContent
      | signInButton |

    And User sending the keys in DialogContent
      | emailCreateInput | cekk7@gmail.com |

    When Click on the element in DialogContent
      | createAccountButton |

    And User sending the keys in DialogContent
      | firstNameInput | far |
      | lastNameInput | far |
      | passwordInput | far123 |

    When Click on the element in DialogContent
      | registerButton |

    Then User should registered successfully
