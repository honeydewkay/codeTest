data= []
clinic = [0] * 5

for _ in range(3):
    sick, temp = input().split()
    data.append((sick, int(temp)))

for i in data:
    if i[0] == 'Y' and i[1] >= 37:
        clinic[0] += 1
    elif i[0] == 'N' and i[1] >= 37:
        clinic[1] += 1
    elif i[0] == 'Y' and i[1] < 37:
        clinic[2] += 1
    else:
        clinic[3] += 1

if clinic[0] >= 2:
    clinic[4] = 'E'

for i in clinic:
    print(i, end=" ")    
# print(data)