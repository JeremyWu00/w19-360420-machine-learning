# Error Analysis
## Introduction to Computer Programming - Section 03
## Jeremy Wu and Stephanie Spina
### Report: Error Analysis  

## Distributions of Model Accuracy
Every time that the classification model is run, there's a different accuracy because in DataSet.java, specifically on the lines 148-150, there's a method used from Collections class that implements the shuffle method. The shuffle method serves to randomize the data. Consequently, the full data set used is no longer exactly the same and the exact accuracy that is printed will most likely not be the same as it was previously, unless the shuffled data is shuffled exactly the same way.

A sensible baseline against which we should compare our model's performance is .......(to finish)

## Analysis of different error types
In the context of medical diagnosis, a false positive occurs when a patient is diagnosed to have an illness; however they are healthy. It incorrectly attributes a disease to a healthy patient. A false negative occurs when a patient diagnosed as healthy; however they have an illness. It incorrectly indicates that the patient is healthy when they are not.
