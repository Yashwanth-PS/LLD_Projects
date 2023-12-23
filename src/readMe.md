***Implementation Steps:***

**Enums:**

1) Create the Closing Type Enum
2) Create the Pen Type Enum
3) Create the Ink Color Enum
4)  Create the Ink Features Enum

**Models:**

1) Create the Pen (Base) Class - Add Attributes, Constructor, Methods, Getters
2) Create the Ink Class - Add Attributes, Parameterized Constructor, Getters
3) Create the Nib Class
4) Create the Refill Class
5) Create the Refillable Interface
6) Create the Ball Pen (Child) Class - Add Constructor, Methods
7) Create the Fountain Pen (Child) Class - Add Attributes, Constructor, Methods
8) Create the Gel Pen (Child) Class - Add Attributes, Constructor, Methods
9) Create the Use and Throw Pen (Child) Class - Add Attributes, Constructor, Methods

**Service:**

1) Create the Interface InkColorChoiceService
2) Create the Interface InkFeaturesChoiceService
3) Create the Interface PenService
4) Create the Ink Chooser Class
5) Create the Class InkColorChoiceServiceImpl which should implement InkColorChoiceService Interface
6) Create the Class InkFeaturesChoiceServiceImpl which should implement InkFeaturesChoiceService Interface
7) Create the Class PenServiceImpl which should implement PenService Interface 

**Controller:**

1) Create the PenController
2) Inject the Pen Service 
3) Handle the User Actions

**Main Class:**

1) Create the Pen Service Object
2) Create the Pen Controller Object 
    - Pass the Pen Service Object while creating the Pen Controller Object
3) Handle the User Actions using the Pen Controller Object