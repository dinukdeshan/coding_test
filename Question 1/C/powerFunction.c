#include<stdio.h> 
  
float power(float num, int power) 
{ 
    float temp; 
    if( pow == 0) 
       return 1; 
    temp = power(num, pow/2);        
    if (pow%2 == 0) 
        return temp*temp; 
    else
    { 
        if(pow > 0) 
            return num*temp*temp; 
        else
            return (temp*temp)/num; 
    } 
}   
  
int main() 
{ 
    printf("%f", power(2.5,-3)); 
    return 0; 
} 