from itertools import cycle, islice


def isRobotBounded(instructions: str) -> bool:
    init_pos = (0, 0)
    init_dir = "N"
    current_pos = init_pos
    current_dir = init_dir
    directions = ["W", "N", "E", "S"]
    d = {
        "N": lambda x, y: (x + 1, y),
        "E": lambda x, y: (x, y + 1),
        "W": lambda x, y: (x, y - 1),
        "S": lambda x, y: (x - 1, y),
    }
    for instruction in instructions:
        if instruction == "R":
            current_dir = next(islice(cycle(directions), directions.index(current_dir) + 1, None))
        if instruction == "L":
            alternate_directions = list(reversed(directions))
            current_dir = next(islice(cycle(alternate_directions), alternate_directions.index(current_dir) + 1, None))
        if instruction == "G":
            current_pos = d[current_dir](*current_pos)
        print(current_dir, current_pos)
    return True if current_pos == init_pos or current_dir != init_dir else False


def isRobotBounded_optimized(instructions: str) -> bool:
    init_pos = (0, 0)
    current_pos = init_pos
    init_dir = (1, 0)
    current_dir = init_dir
    directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
    d = {
        (1, 0): lambda x, y: (x + 1, y),
        (0, 1): lambda x, y: (x, y + 1),
        (-1, 0): lambda x, y: (x - 1, y),
        (0, -1): lambda x, y: (x, y - 1),
    }
    for instruction in instructions:
        if instruction == "R":
            current_dir = directions[(directions.index(current_dir) + 1) % 4]
        if instruction == "L":
            current_dir = directions[(directions.index(current_dir) + 3) % 4]
        if instruction == "G":
            current_pos = d[current_dir](*current_pos)
        print(current_dir, current_pos)
    return True if current_pos == init_pos or current_dir != init_dir else False


res = isRobotBounded_optimized("GLRLLGLL")
print(res)
