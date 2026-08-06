# Simple Graph (Adjacency List)
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': [],
    'D': [],
    'E': []
}

# ---------------- BFS ----------------
def bfs(start):
    visited = []        # to store visited nodes
    queue = [start]     # queue for BFS

    while queue:
        node = queue.pop(0)   # remove first element
        if node not in visited:
            visited.append(node)
            queue.extend(graph[node])  # add neighbours

    return visited


# ---------------- DFS ----------------
def dfs(node, visited):
    if node not in visited:
        visited.append(node)
        for neighbour in graph[node]:
            dfs(neighbour, visited)
    return visited


# Calling Functions
print("BFS Traversal:", bfs('A'))
print("DFS Traversal:", dfs('A', []))