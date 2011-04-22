#!/bin/bash
for i in scheme/*.wsdl; do
    echo $i
    wsimport -s generated $i
done
    
