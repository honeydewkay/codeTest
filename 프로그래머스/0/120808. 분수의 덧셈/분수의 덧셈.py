import math
def solution(numer1, denom1, numer2, denom2):
    answer = []
    a = numer1 * denom2 + numer2 * denom1
    b = denom1 * denom2
    gcd = math.gcd(a,b)
    a /= gcd
    b /= gcd
    answer = [a,b]
    return answer
# gcd 알고리즘 math.gcd(a,b)