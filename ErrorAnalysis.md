# Error Analysis
## Introduction to Computer Programming - Section 03
## Jeremy Wu

## Distributions of Model Accuracy
Every time that the classification model is run, there's a different accuracy because in 
DataSet.java, specifically on the lines 148-150, there's a method used from Collections
shuffle, which randomizes the data. Consequently, the full data set used is no longer 
exactly the same and the exact accuracy that is printed will most likely not be the same
as it was previously, unless the shuffled data is shuffled exactly the same way.


## Analysis of different error types
A false positive iis a
