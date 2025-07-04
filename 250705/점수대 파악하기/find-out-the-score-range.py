points = map(int, input().split())
count = [0] * 10
hundred = 0

for point in points:
    if point == 0:
        break
    if point == 100:
        hundred += 1
    elif point >= 0:
        tens = point // 10
        count[tens] += 1

print(f"100 - {hundred}")
for i in range(9, 0, -1):
    print(f"{i}0 - {count[i]}")
    

