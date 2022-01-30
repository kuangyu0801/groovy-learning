// ref: https://groovy-lang.org/grape.html
@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
)

import org.apache.commons.lang3.text.WordUtils
String name = "Kuang Yu Li"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)