

            while( s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;  // duplicate
                }
            }else{
                // opening
                s.push(ch);
            }