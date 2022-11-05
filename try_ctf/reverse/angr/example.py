import angr

p = angr.Project('./1.exe')

state = p.factory.entry_state()

path = p.factory.path(state)

pathgroup = p.factory.path_group(path)
pathgroup.step(until=lambda lpg: len(lpg.active) > 1)

for i in range(len(pathgroup.active)):
    print ("possible %d: " % i , pathgroup.active[i].state.posix.dumps(0))


