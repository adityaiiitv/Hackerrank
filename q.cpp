// AUTHOR: ADITYA PRAKASH
#include <iostream>		// HEADER FILES
#include <string.h>
#include <stdlib.h>
using namespace std;
int main()				// MAIN FUNCTION
{
	char s[10];			// INPUT STRING
	cout<<"\n Enter the string in form of xs and ys: ";
	cin>>s;
	int l=strlen(s);
	int len=l+1;		// LENGTH OF SERIES CREATED
	int series[len];
	for(int i=0;i<len;i++)
	{
		series[i]=i;
	}
	int done=0;			// FLAG
	while(done==0)
	{
		int i=0;
		double r = ((double) rand() / (RAND_MAX));	// RANDOM REPLACEMENT IN SERIES
		r=r*len;
		int p=int(r);
		int temp=series[i];
		series[i]=series[p];
		series[p]=temp;
		// do
		while(i<l)
		{
			i++;
			if(s[i-1]=='x' || s[i-1]=='X')	// CHECK
			{
				int done1=0;
				while(done1==0)
				{
					double r = ((double) rand() / (RAND_MAX));
					r=r*len;
					p=int(r);
					if(series[p]>=series[i-1])
					{
						temp=series[i];			// REPLACE
						series[i]=series[p];
						series[p]=temp;
						done1=1;
					}
				}
			}
			if(s[i-1]=='y' || s[i-1]=='Y')	// CHECK
			{
				int done1=0;
				while(done1==0)
				{
					double r = ((double) rand() / (RAND_MAX));
					r=r*len;
					p=int(r);
					if(series[p]<=series[i-1])
					{
						temp=series[i];			// REPLACE
						series[i]=series[p];
						series[p]=temp;
						done1=1;
					}
				}
			}
		}
		
		// check
		done=1;
		int j=0;
		while(j<l)
		{
			if(s[j]=='x' || s[j]=='X')
			{
				if(series[j]>series[j+1])
				{
					done=0;				// REDO
				}
			}
			if(s[j]=='y' || s[j]=='Y')
			{
				if(series[j]<series[j+1])
				{
					done=0;				// REDO
				}
			}
			j++;
		}

	}
	cout<<"\n";
	for(int i=0;i<len;i++)
	{
		cout<<series[i];
	}
	return 0;
}
// END OF PROGRAM
