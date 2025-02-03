n = int(input())

for i in range(n):
    print("*" *(n-i) + "  " * (i) + "*" *(n-i) )


# n = 4
# ******** 0 
# ***  *** 1 
# **    ** 2
# *      * 3