Drop here your libs that cannot be found in the maven repository
(like mid.jar and commons-glide.jar (Paris) and vault-java-driver-5.3.0.jar (customized version?!)

If you are missing other classes during build find the class in the mid server downloaded zip archive by going to <zip>/agent/lib/ jar files
and use the following command: "find . -name '*.jar' -exec grep -Hls <Missing class name> {} \;"