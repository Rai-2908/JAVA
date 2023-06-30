#include <bits/stdc++.h>
using namespace std;
vector<int> dijkstra(vector<vector<int>> &vec, int vertices, int edges, int source)
{
    unordered_map<int, list<pair<int, int>>> adj;
    for (int i = 0; i < edges; i++)
    {
        int u = vec[i][0];
        int v = vec[i][1];
        int dist = vec[i][2];

        //pair<int,int> p1 = make_pair(u,dist),p2=make_pair(v,dist);
        adj[u].push_back(make_pair(v, dist));
        adj[v].push_back(make_pair(u, dist));
    }

    vector<int> dist(vertices, INT_MAX);
    set<pair<int, int>> st;
    dist[source] = 0;
    st.insert(make_pair(0, source));
    
    while (!st.empty())
    {
        // fetch top record
        auto top = *(st.begin());
        int nodeDist = top.first;
        int node = top.second;
        // delete top
        st.erase(st.begin());
        // traverse the adj
       
        for (auto it : adj[node])
        {
            if (nodeDist + it.second < dist[it.first])
            {
                auto record = st.find(make_pair(dist[it.first], it.first));
                if (record != st.end())
                    st.erase(record);
                // distance update
                dist[it.first] = nodeDist + it.second;
                // insert value in set
                st.insert(make_pair(dist[it.first], it.first));
            }
        }
    }
   
    return dist;
}

int main()
{
    int n, e;
    // Undirected Graph
    cout << "No of nodes: ";
    cin >> n;
    cout << "No of edges: ";
    cin >> e;
    
    vector<vector<int>> edges;
    for (int i = 0; i < e; i++)
    {
        int u, v, wt;
        cin >> u;
        cin >> v;
        cin >> wt;
        edges.push_back({u, v, wt});
    }
    
    vector<int> distance = dijkstra(edges, n, edges.size(), 0);
    for (int i = 0; i < n; i++)
    {
        cout << "Shortest distance from 0 to " << i << ": " << distance[i] << endl;
    }
    return 0;
}
