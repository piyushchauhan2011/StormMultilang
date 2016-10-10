import storm

class SplitSentenceBolt(storm.BasicBolt):
    def process(self, tup):
	try:
            words = tup.values[0].split(" ")
	    if not words:
                self.log("Something is wrong here")
                self.log("******** " + tup + " *********")
                self.fail(tup)
                return	
            for word in words:
                storm.emit([word])
	except TypeError as e:
            self.fail(tup)
	    return	

SplitSentenceBolt().run()
