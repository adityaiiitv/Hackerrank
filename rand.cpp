// AUTHOR: ADITYA PRAKASH
#include <iostream>		// HEADER FILES
#include <stdlib.h>
#include <string.h>
using namespace std;	// STANDARD NAMESPACE
int main()				// MAIN FUNCTION
{
	cout<<"\n Enter a string with length less than 10: ";
	char str[10],str1[10];	// str1 FOR THE ORIGINAL STRING AND STR TO PERMUTE THE STRING
	cin>>str;
	strcpy(str1,str);
	int done=0,work=0;		// FLAGS
	int l=strlen(str);
	while(done==0)			// WHILE NOT FOUND
	{
		int i=0;			// TRAVERSE THE STRING
		while(i<l)
		{	
			double r = ((double) rand() / (RAND_MAX));	// REPLACE THE CHARACTER WITH SOME RANDOM CHARACTER PRESENT IN THE STRING
			r=r*l;
			char c=str[int(r)];
			str[int(r)]=str[i];
			str[i]=c;									// REPLACEMENT COMPLETE
			i++;
		}
		done=1;
		for(int j=0;j<l;j++)
		{
			if(str[j]==str1[j])			// IF ANY LETTER IS AT ITS ORIGINAL PLACE THEN NOT done
			{
				done=0;				
			}
		}
		work++;
		if(work==1000)					// GIVE UP IF THE ITERATIONS CROSS 1000
		{
			done=1;
		}
	}
	if(work==1000)
	{
		cout<<"\n Not possible for the given string.";
	}
	if(work<1000)
	{
		cout<<"\n It is possible. The rearrangement yields: ";
		cout<<str;
	}
	return 0;
}
// END OF PROGRAM
