n1, n2 = int, input().split()
a = list(input().split())
b = list(input().split())

whole = ''.join(a)
part = ''.join(b)


if part in whole:
    print("Yes")
else:
    print("No")