import storm

class CallLogCreatorBolt(storm.BasicBolt):
    def process(self, tup):
        from = tup.values[0]
        to = tup.values[1]
        duration = tup.values[2]
        storm.emit([from + " - " + to, duration])

CallLogCreatorBolt().run()