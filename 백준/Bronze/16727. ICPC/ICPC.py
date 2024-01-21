# 입력 받기
p1, s1 = map(int, input().split())
s2, p2 = map(int, input().split())

# 두 경기의 득점을 더해서 aggregate score 계산
aggregate_score_persepolis = p1 + p2
aggregate_score_esteghlal = s1 + s2

# 어웨이 골 계산
away_goals_persepolis = s2
away_goals_esteghlal = p1

# 승자 결정
if aggregate_score_persepolis > aggregate_score_esteghlal:
    print("Persepolis")
elif aggregate_score_persepolis < aggregate_score_esteghlal:
    print("Esteghlal")
else:
    # 만약 aggregate score가 같다면 어웨이 골로 결정
    if away_goals_persepolis > away_goals_esteghlal:
        print("Persepolis")
    elif away_goals_persepolis < away_goals_esteghlal:
        print("Esteghlal")
    else:
        # 어웨이 골도 같다면 패널티 킥
        print("Penalty")