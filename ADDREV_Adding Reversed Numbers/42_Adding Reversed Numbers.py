# Project name : SPOJ: Sum of digits
# Author       : Wojciech Raszka
# Date created : 2019-??-??
# Description  :
# Status       : Accepted ()
# Comment      :

no_of_cases = int(input())

for c in range(no_of_cases):
    print(int(str(sum(map(lambda s: int(s[::-1]), input().split(' '))))[::-1]))
