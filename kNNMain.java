import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

	String PATH_TO_DATA = args[0];
	
	List<DataPoint> fullDataSet =  DataSet.readDataSet(PATH_TO_DATA);
	KNNClassifier john = new KNNClassifier(9);
	DataPoint datachosen = fullDataSet.get(49);
	DataPoint chosendata = fullDataSet.get(50);
	for( int i=0; i<datachosen.x.length; i++)
	{
	System.out.println(datachosen.x[i]);
	}
	System.out.println("Label: "+datachosen.label);
	
	
    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
	List<DataPoint> TestSet = DataSet.getTestSet(fullDataSet, 0.3);
	List<DataPoint> TrainingSet= DataSet.getTrainingSet(fullDataSet, 0.7 );


    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)

	System.out.println(DataSet.distanceEuclid(datachosen,chosendata));

    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label

	System.out.println(john.predict(fullDataSet, datachosen));
	

    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.
	double steve[]= new double[1000];
	for (int k=0; k<1000; k++)
	{	
		
		int don=0;
		for(int i=0; i<(TestSet.size()); i++)
		{
			DataPoint bob = TestSet.get(i);
			String rob = john.predict(TestSet, bob);
			if (rob.equals(bob.label))
			{
				don++;
			}
		}
		steve[k]=(((double)don/(double)(TestSet.size()))*100.0);
		//System.out.println(steve[k]+ "%");
	}
	System.out.println("the mean is "+ mean(steve));
	System.out.println("the standard deviation is  is "+ standardDeviation(steve));
		
		

  }

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
