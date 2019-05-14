# Error Analysis
## Introduction to Computer Programming - Section 03
## Jeremy Wu and Stephanie Spina

## Distributions of Model Accuracy
Every time that the classification model is run, there's a different accuracy because in DataSet.java, specifically on the lines 148-150,a shuffle method is implemented from the Collections class. The shuffle method serves to randomize the data. Consequently, the full data set used is no longer exactly the same and the exact accuracy that is printed will most likely not be the same as it was previously, unless the shuffled data is shuffled exactly the same way.

A sensible baseline against which we should compare our model's performance is 65% or greater. When using the printLabelFrequencies method there are 444 patients who have a benign tumour and there are 237 patients who have a malignant tumour. 

## Analysis of different error types
In the context of medical diagnosis, a false positive occurs when a patient is diagnosed to have an illness; however they are healthy. It incorrectly attributes a disease to a healthy patient. A false negative occurs when a patient diagnosed as healthy; however they have an illness. It incorrectly indicates that the patient is healthy when they are not.

Recall is the fraction that represents the ability of the model to select relevant items in the breast cancer dataset. Recall is also known as sensitivity and it indicates how many patients are diagnosed with an illness and are truly ill (true positives) out of those that are diagnosed as healthy but are ill (false negative) and those that are diagnosed as ill and are truly ill (true positives). In other words, it is calculated by dividing the number of true positives by the number of true positives and false negatives.

Precision is the fraction that represents the relevant items among the retrieved items in the breast cancer dataset. Precision indicates how many patients are diagnosed with an illness and are truly ill (true positives) out of those that are diagnosed with an illness and are truly ill (true positives) and are diagnosed as ill but are truly healthy (false positive).In other words, it is calculated by dividing the number of true positives by the number of true positives and false positives.

A sensibles baseline for Precision value is..... 
A sensible baseline for the Recall value is ....
The precision value increases and recall value decreases as the hyperparameter k changes.
