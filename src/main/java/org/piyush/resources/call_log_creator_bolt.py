import storm

class CallLogCreatorBolt(storm.BasicBolt):
    def process(self, tup):
        from = tup[0]
        to = tup[1]
        duration = tup[3]
        storm.emit([from + " - " + to, duration])

CallLogCreatorBolt().run()