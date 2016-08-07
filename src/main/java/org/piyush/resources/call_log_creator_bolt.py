import storm

class CallLogCreatorBolt(storm.BasicBolt):
    def process(self, tup):
        fro = tup.values[0]
        to = tup.values[1]
        duration = tup.values[2]
        storm.emit(["".join(fro, " - ", to), duration])

CallLogCreatorBolt().run()