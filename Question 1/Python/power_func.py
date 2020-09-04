#Iterations based power function
def power_func(num, power):
    try:
        ans = 1
        for i in range(abs(power)):
            ans = ans*num
            
        if power>=0:
            return ans
            
        #If the power is a negative integer
        else:
            return 1/ans
    except:
        #This function can't output fractional powers
        print("Do not input fractional powers")
        
        
# A different implementaion of the power function

#This method should not be used as it is much more
#inefficient compared to it's iterative counterpart
#Although in this case Recursion can be made much faster

#Recursion based power function
def rec_pw_func(num, power):
    if power == 0:
        return 1
    else:
        if power < 0:
            return 1/(num*rec_pw_func(num,abs(power)-1))
        else:
            return num*rec_pw_func(num,abs(power)-1)
    
        
#Both these functions will not output results for fractional powers 

print(power_func(3,5))
