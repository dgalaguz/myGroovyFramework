package utils

import groovy.json.JsonSlurper

/**
 * Contains commonly used tools
 */
class CommonUtils {
    static def ReadDataFromPath(String path){
        new JsonSlurper().parseText(new File(path).text)
    }
}
